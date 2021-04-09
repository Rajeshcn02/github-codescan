public class UrlRedirect extends HttpServlet {
	private static final String VALID_REDIRECT = "http://cwe.mitre.org/data/definitions/601.html";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		// GOOD: the request parameter is validated against a known fixed string
		if (VALID_REDIRECT.equals(request.getParameter("target"))) {
			response.sendRedirect(VALID_REDIRECT);
		}
	}
}
