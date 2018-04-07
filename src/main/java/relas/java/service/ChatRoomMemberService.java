package relas.java.service;

import relas.java.service.dto.ChatRoomMemberDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing ChatRoomMember.
 */
public interface ChatRoomMemberService {

    /**
     * Save a chatRoomMember.
     *
     * @param chatRoomMemberDTO the entity to save
     * @return the persisted entity
     */
    ChatRoomMemberDTO save(ChatRoomMemberDTO chatRoomMemberDTO);

    /**
     * Get a list of chat room member by chat room id
     * @param chatId chat room id
     * @return return a list of chat room member, if this chat room is not empty, otherwise null
     * */
    List<ChatRoomMemberDTO> getMembersOfChatRoom(long chatId);

    /**
     * Get all the chatRoomMembers.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ChatRoomMemberDTO> findAll(Pageable pageable);

    /**
     * Get the "id" chatRoomMember.
     *
     * @param id the id of the entity
     * @return the entity
     */
    ChatRoomMemberDTO findOne(Long id);

    /**
     * Delete the "id" chatRoomMember.
     *
     * @param id the id of the entity
     */
    void delete(Long id);

    /**
     * Search for the chatRoomMember corresponding to the query.
     *
     * @param query the query of the search
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<ChatRoomMemberDTO> search(String query, Pageable pageable);
}
