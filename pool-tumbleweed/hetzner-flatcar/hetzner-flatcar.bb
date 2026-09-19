SUMMARY = "A tool to deploy Flatcar Linux on Hetzner Cloud"
DESCRIPTION = "A tool to deploy Flatcar Linux on Hetzner Cloud. Includes transpiling of \
Container Linux Config and reinstalling maschines on changes."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "hetzner-flatcar-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "9e3f594b588f01a4bc4447dad837a8d8252c98586fa136dc8a9019b6df7b116a7517e8dcada2edfa8e73745161903010db496a26af017e35dc25b795db445e97"

RPROVIDES:${PN} += "hetzner-flatcar"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
