SUMMARY = "Development libraries and header files for libsphinxclient"
DESCRIPTION = "Provides necessary development files for sphinx api and shared libs for sphinx client. \
Pure C searchd client API library \
Sphinx search engine, http://sphinxsearch.com/"
LICENSE = "GPL-2.0-only"

PV = "2.2.11"

RPM_NAME = "libsphinxclient-devel-2.2.11-10.10.aarch64.rpm"
RPM_HASH = "96058b5f25df55c25eae541392c1bc569d22fd40de83de1bd8926d9d7d9173194557ac1308ce6ff4e46a39352c703689833d77326f2a1015655c1c7df82f93dc"

RPROVIDES:${PN} += "libsphinxclient-devel"

RDEPENDS:${PN} += "libsphinxclient-0-0-1"

inherit rpm
