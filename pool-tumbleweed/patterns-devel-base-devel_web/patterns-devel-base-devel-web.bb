SUMMARY = "Web Development"
DESCRIPTION = "Tools and libraries for Web application development."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_web-20170319-13.4.aarch64.rpm"
RPM_HASH = "14833f034e6d388ee76610d13c15cf80c15090e85313ff88ccf3cb64754e0ea93ea4f0923e9e33ef6be7e21ebc8b427432bbbed14a8857e94f4f2314f97307dc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-web"

RDEPENDS:${PN} += "pattern-"

inherit rpm
