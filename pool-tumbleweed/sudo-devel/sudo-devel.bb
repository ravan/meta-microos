SUMMARY = "Header files needed for sudo plugin development"
DESCRIPTION = "These header files are needed for building of sudo plugins."
LICENSE = "ISC"

PV = "1.9.17p2"

RPM_NAME = "sudo-devel-1.9.17p2-4.1.aarch64.rpm"
RPM_HASH = "d25eadbc2817a2a1dd434f6d80a1ba55f7315959e0855728f3a7424b5f5844d403498bf715be62f29f182aca8907798fbe6fe1f90477268be17f81daba641678"

RPROVIDES:${PN} += "sudo-devel"

RDEPENDS:${PN} += "sudo"

inherit rpm
