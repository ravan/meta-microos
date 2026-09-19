SUMMARY = "Fake sudo"
DESCRIPTION = "Fake sudo leveraging machinctl shell and polkit to be able to \
execute commands as root \
 \
- just a few lines of shell and js \
- no setuid program \
- no hard to understand config file"
LICENSE = "MIT"

PV = "0"

RPM_NAME = "fudo-0-1.9.aarch64.rpm"
RPM_HASH = "755d96aa9b58583673ed9f8c95da3c9b4945bb1a18aadfa9804f56e7e68e2f8f20c97a7e6dbd8db325a3c1468d8f8c4732cf99563fce7c6b5fc28baa430e9e88"

RPROVIDES:${PN} += "fudo"

RDEPENDS:${PN} += "polkit \
systemd-container"

inherit rpm
