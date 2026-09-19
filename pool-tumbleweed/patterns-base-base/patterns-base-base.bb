SUMMARY = "Base System"
DESCRIPTION = "This is the base runtime system.  It contains only a basic multiuser booting system. For running on real hardware, you need to add additional packages and pattern to make this pattern useful on its own."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-base-20241218-34.1.aarch64.rpm"
RPM_HASH = "5487d51e58146465325b752377c0b7d69d5ac691916f5bcef8d3ed4f8e21a93f039ba9f9923ef444cc70667a5d69d55796ae841cefbaba2e8cc37990d3660ab3"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-base \
patterns-openSUSE-base \
patterns-openSUSE-minimal"

RDEPENDS:${PN} += "aaa-base \
bash \
ca-certificates-mozilla \
coreutils \
coreutils-systemd \
glibc \
glibc-locale-base \
libnss-usrfiles2 \
ntp-daemon \
pam \
pam-config \
pattern- \
procps \
rpm \
shadow \
systemd \
terminfo-base \
timezone \
user-nobody \
util-linux \
wtmpdb"

inherit rpm
