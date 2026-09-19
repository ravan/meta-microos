SUMMARY = "A Kubernetes context switcher"
DESCRIPTION = "kubie offers context switching, namespace switching and prompt modification in a \
way that makes each shell independent from others. It also has support for \
split configuration files, meaning it can load Kubernetes contexts from \
multiple files. You can configure the paths where kubie will look for \
contexts, see the settings section."
LICENSE = "Zlib"

PV = "0.28.0"

RPM_NAME = "kubie-0.28.0-1.4.aarch64.rpm"
RPM_HASH = "8392d2617205a7deab523b24035a8544d51579d31c6021160cf1434e8f4efe9dee870707ab0264f795c7758d737c510d7cdd511a927954d57c33e6f6d5890b8f"

RPROVIDES:${PN} += "kubie"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
