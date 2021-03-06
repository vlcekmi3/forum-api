package cz.cvut.fel.wa2.forum.service;

import cz.cvut.fel.wa2.forum.dto.CategoryDTO;
import java.util.List;

public interface CategoryService {

    public List<CategoryDTO> getAll();

    public List<CategoryDTO> find(String sort, String filter, int base, int offset);

    public CategoryDTO get(Long id);

    public void delete(Long id);

    public Long getCount();

    public Long save(CategoryDTO dto);
}
