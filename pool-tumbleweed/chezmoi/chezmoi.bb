SUMMARY = "A multi-host manager for dotfiles"
DESCRIPTION = "chezmoi is a manager for personal preference configs and state files \
('dotfiles') that programs such as editors might create. chezmoi \
sources dotfiles from a GitHub repository and installs them onto new, \
empty machines."
LICENSE = "MIT"

PV = "2.72.1"

RPM_NAME = "chezmoi-2.72.1-1.1.aarch64.rpm"
RPM_HASH = "fc73253ba8346f20b2e4c9409ad7666f09795cfd89f59c1a42b49a33b64e25223dcc6697d371c6effa8dc11bd97ae70b9b246c6b0f88abbca109ec0c69267675"

RPROVIDES:${PN} += "chezmoi"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
