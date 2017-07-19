@RequestParam(value = "types", required = false) List<Long> types
@Transactional(readOnly = true)
@RequestMapping(value = "/s/getMaterialListObjs", method = RequestMethod.GET)
public List<WSSelectObj> getMaterialListObjs(
@RequestParam(value = "q", required = false) String q,@RequestParam(value = "types", required = false) List<Long> types)