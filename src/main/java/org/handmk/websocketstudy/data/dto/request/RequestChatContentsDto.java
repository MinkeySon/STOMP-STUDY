package org.handmk.websocketstudy.data.dto.request;

import lombok.*;
import org.handmk.websocketstudy.data.enums.MessageType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class RequestChatContentsDto {
    private MessageType type;
    private String contents;
}
