SUMMARY = "Tool to check websites and HTML documents for broken links"
DESCRIPTION = "LinkChecker checks websites and HTML documents for broken links. \
 \
Features are: \
* recursive checking \
* multithreaded \
* output in colored or normal text, HTML, SQL, CSV, XML or a sitemap graph in different formats \
* HTTP/1.1, HTTPS, FTP, mailto:, news:, nntp:, Gopher, Telnet and local file links support \
* restriction of link checking with regular expression filters for URLs \
* proxy support \
* username/password authorization for HTTP and FTP \
* robots.txt exclusion protocol support \
* i18n support \
* a command line interface \
* a (Fast)CGI web interface (requires HTTP server)"
LICENSE = "GPL-2.0-or-later"

PV = "10.5.0"

RPM_NAME = "python3-linkchecker-10.5.0-2.5.noarch.rpm"
RPM_HASH = "20b65f8be5e4562db6269954fbff3cf3daf9cb39c3277d701196b90a435a7796da56eb70f7ff142ac9cf14b4eb252e58b130d7ac2383432e9a8b2514ade152c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linkchecker \
python3-linkchecker \
python3.13dist-linkchecker \
python3dist-linkchecker"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-beautifulsoup4 \
python3-dnspython \
python3-pyxdg \
python3-requests \
update-alternatives"

inherit rpm
