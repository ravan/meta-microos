SUMMARY = "Containerize Window Managers, apps and config from a declarative state in Git"
DESCRIPTION = "Define your Window Manager and Workloads in Git and run them as containers. Just like dotfiles management, but better."
LICENSE = "Apache-2.0"

PV = "0.0.21"

RPM_NAME = "qubesome-0.0.21-1.1.aarch64.rpm"
RPM_HASH = "61f71aadcc488e2c5397dd6e9efd109fd001c538480fe6ce1a53262a8a27cbec6c211804e16bacaf92093b9f338572f13b13f3ca187d1a911242db67efc49dc7"

RPROVIDES:${PN} += "qubesome"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
