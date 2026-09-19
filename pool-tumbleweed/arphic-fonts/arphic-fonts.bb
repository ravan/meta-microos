SUMMARY = "Chinese TrueType Fonts (Contains Only the License Text)"
DESCRIPTION = "Chinese TrueType fonts by Arphic Technology. This package contains only \
the license texts. The fonts themselves are in the sub-packages \
arphic-bkai00mp-fonts, arphic-bsmi00lp-fonts, arphic-gkai00mp-fonts, and \
arphic-gbsn00lp-fonts."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-fonts-20001125-779.3.noarch.rpm"
RPM_HASH = "1b1c9843f047547fd74affbc4145c02f9a6d7666ed0398518dda6544cda6178bc7cad3d60f69ff8d48e8e89aa14917030c20304b7417fcd196f8cc3302cce3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-fonts \
ttf-arphic"

RDEPENDS:${PN} += "aaa-base \
coreutils \
perl"

inherit rpm
