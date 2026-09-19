SUMMARY = "IMA/EVM Support"
DESCRIPTION = "Packages required to enable IMA/EVM on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ima_evm-5.0-111.1.aarch64.rpm"
RPM_HASH = "cccb169a05153aef7e724aee792ea7f1595f3ccc5af0709b85d1c9b259c8f5ecfd768a78b18f8fe9040338e1918af28db0644f1bcb3aad8d19c87b23a60969fc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-ima-evm"

RDEPENDS:${PN} += "attr \
dracut-ima \
ima-evm-utils \
keyutils"

inherit rpm
