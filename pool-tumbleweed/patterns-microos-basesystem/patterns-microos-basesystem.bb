SUMMARY = "openSUSE MicroOS Base System (alias pattern for microos_base)"
DESCRIPTION = "This is the openSUSE MicroOS runtime system. It contains only a minimal multiuser \
booting system."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-basesystem-5.0-111.1.aarch64.rpm"
RPM_HASH = "2c524aae1b35168b5a284ceb44c4017e9887c7c55ebd0ca44adc17fa22ec8584f2f8b30851d3c735e324b6f6333ce42bd723c14fba56d8ba8d3e8c7de53d66b3"

RPROVIDES:${PN} += "pattern- \
pattern-icon- \
patterns-microos-basesystem"

RDEPENDS:${PN} += "pattern-"

inherit rpm
