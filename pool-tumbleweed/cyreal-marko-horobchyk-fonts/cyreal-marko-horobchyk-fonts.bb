SUMMARY = "Marko Horobchyk Font"
DESCRIPTION = "Marko Horobchyk is a brush-inspired typeface for children's literature. \
 \
As the name suggests (Horobchyk is Ukrainian for sparrow), the initial \
idea was to create a typeface-companion for Marko the sparrow — a \
cartoon character by illustrator and type designer Zhenya Spizhovyi. \
 \
Marko Horobchyk is simple and smooth, has special inner tension and \
eye-catchy detailing. The letterforms are based on calligraphy and \
sketches — this is what makes Marko Horobchyk lively, enchanting, and \
amiable. \
 \
Marko Horobchyk will work best in medium to large sizes and captivating \
headlines. \
While it is technically optimised for better performance on screen, \
carefully adjusted outlines promise good quality in print too."
LICENSE = "OFL-1.1"

PV = "1.003"

RPM_NAME = "cyreal-marko-horobchyk-fonts-1.003-7.25.noarch.rpm"
RPM_HASH = "05d5d02036d01179ad2da6d263c37601e3cad36dfec5fe7a7a611ffa2a4ec69beffa692162a40cc5d2481521f04175c452eee4721c00b5ed5e9698350bed9e96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-marko-horobchyk-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
