SUMMARY = "Alice Font"
DESCRIPTION = "Ksenia Erulevich, designer of the Alice typeface, was inspired by Lewis \
Carrol’s novel and decided to make a typeface that will be suitable for \
typesetting that book. \
 \
It came out eclectic and quaint, old-fashioned, having widened \
proportions, open aperture, and soft rounded features; perfect for long \
meditative text-setting and headlines."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "cyreal-alice-fonts-2.003-1.9.noarch.rpm"
RPM_HASH = "d9a73cac5c6fbae51b4e4da5b297e8e8057815a05adb651c1d29c38995b8ab9b83bfd87da708d085d0758e30802bd16f08b2e47221f2801182b3ef28d129bf11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-alice-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
