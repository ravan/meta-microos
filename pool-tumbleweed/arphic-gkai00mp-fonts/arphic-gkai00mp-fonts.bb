SUMMARY = "AR PL KaitiM GB Chinese TrueType font by Arphic Technology"
DESCRIPTION = "AR PL KaitiM GB is a high quality Chinese TrueType font (gkai00mp.ttf) \
generously provided by Arphic Technology to the Free Software community \
under the Arphic Public License."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-gkai00mp-fonts-20001125-779.3.noarch.rpm"
RPM_HASH = "5601fe4a1e1a8c0b032645d348ac5d961cc9ac8805ed3395441485e644609dbf4b84e5968de365e534aff5cb7a49fd65e30d1891551daa09ef3dc3b7d11ac4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-gkai00mp-fonts \
config-arphic-gkai00mp-fonts \
ttf-arphic-gkai00mp"

RDEPENDS:${PN} += "/usr/bin/sh \
arphic-fonts"

inherit rpm
