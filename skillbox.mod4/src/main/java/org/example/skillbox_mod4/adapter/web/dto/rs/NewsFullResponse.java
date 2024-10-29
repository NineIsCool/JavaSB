package org.example.skillbox_mod4.adapter.web.dto.rs;

import java.util.List;

public record NewsFullResponse(Long id, String content, String authorName, List<String> comments, String categoryName) {
}
