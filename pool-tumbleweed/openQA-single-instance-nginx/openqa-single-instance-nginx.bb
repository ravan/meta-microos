SUMMARY = "Convenience package for a single-instance setup using nginx proxy"
DESCRIPTION = "Use this package to setup a local instance with all services provided together."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-single-instance-nginx-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "10e0b54d4c8a2a2cb471b166a532abe3211869061c9a376c95e62b5d71cc21eb2f6338be97655c42f1e629c97d351723b82f7cda68b18b6c0bd2f6791b99796e"

RPROVIDES:${PN} += "openQA-single-instance-nginx"

RDEPENDS:${PN} += "nginx \
openQA \
openQA-local-db \
openQA-worker"

inherit rpm
