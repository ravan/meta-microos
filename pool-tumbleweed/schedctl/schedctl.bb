SUMMARY = "Linux eBPF sched_ext plug and play schedulers for fun and profit"
DESCRIPTION = "eBPF sched_ext plug and play containerized schedulers for fun and profit"
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "schedctl-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "f0884c259968000a69e0c3756d3457bd8bb36c50016f42ab3ed534ca29572342df3737a2c4b720c1f672131a7e8f48c8554f23f21c5ea1313455a60c85b5a73c"

RPROVIDES:${PN} += "schedctl"

RDEPENDS:${PN} += "libc.so.6 \
libgpgme.so.45"

inherit rpm
