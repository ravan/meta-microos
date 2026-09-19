SUMMARY = "Class providing URI query string manipulation"
DESCRIPTION = "URI::Query provides simple URI query string manipulation, allowing you to \
create and manipulate URI query strings from GET and POST requests in web \
applications. This is primarily useful for creating links where you wish to \
preserve some subset of the parameters to the current request, and \
potentially add or replace others. Given a query string this is doable with \
regexes, of course, but making sure you get the anchoring and escaping \
right is tedious and error-prone - this module is simpler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.16"

RPM_NAME = "perl-URI-Query-0.16-1.26.noarch.rpm"
RPM_HASH = "2c504e9dc37db171118183f9db1bb0003e45c10f28aa72ef6fd98c6b31febc1d7cd293404a3b5d09b751375e8dff956e2d9a0232962557ca944a64e92114197f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-URI--Query \
perl-URI-Query"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Clone \
perl-URI--Escape \
perl-parent"

inherit rpm
