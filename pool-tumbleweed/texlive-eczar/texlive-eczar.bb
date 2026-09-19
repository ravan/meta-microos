SUMMARY = "A font family supporting Devanagari and Latin script"
DESCRIPTION = "rojhettaa sNsthecaa egjhaar haa yunikodd aadhaarit mukt ttNk \
aahe. hyaa ttNkaat 45+3 bhaassaa leNttin v devnaagrii lipiit \
purskRt kelyaa jaataat. vaibhv siNh hyaaNnii hyaa ttNkaacaa \
abhiklp kelaa aahe v aajnyaavlii tsec nirmitii ddevhidd \
brejhiinaa hyaaNnii kelii aahe. egzaar yh rozettaa dvaaraa \
prkaashit yunikodd aadhaarit mukt ttNk hai / is ttNk dvaaraa \
45+3 bhaassaaeN laittin tthaa devnaagrii lipi meN purskRt kii \
jaatii hai / vaibhv siNh ne is kaa abhiklp kiyaa hai aur \
aajnyaavli tthaa nirmiti ddevidd breziinaa dvaaraa kii gyii hai \
/ Eczar is an open-source type family published by Rosetta. The \
fonts support over 45+3 languages in Latin and Devanagari \
scripts in 5 weights. These fonts were designed by Vaibhav \
Singh, code and production are by David Brezina."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.1svn57716"

RPM_NAME = "texlive-eczar-2026.226.0.0.1svn57716-61.4.noarch.rpm"
RPM_HASH = "d5acac64edc60841488d514b863c52c1e2441fbb7589ec29032b7503bfcd59eea0ebaa40080afeeb3e5d9b29159402e5edee2762f7deaccf7376e9dcacc8e2c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eczar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-eczar-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
