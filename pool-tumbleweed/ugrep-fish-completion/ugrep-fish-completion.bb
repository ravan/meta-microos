SUMMARY = "Fish completion for ugrep"
DESCRIPTION = " \
This package contains the fish completion for ugrep."
LICENSE = "BSD-3-Clause"

PV = "7.8.4"

RPM_NAME = "ugrep-fish-completion-7.8.4-1.1.noarch.rpm"
RPM_HASH = "73573b5eda18025491c08c30cf297efd0a3933f2cc3a6a7e9066d382e62c759545670b2af52575d90b6038e5e3f5648aab54c6b6d0b59a7a789360f747e11fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ugrep-fish-completion"

RDEPENDS:${PN} += "fish \
ugrep"

inherit rpm
