SUMMARY = "Fish Completion for versitygw"
DESCRIPTION = "Fish command line completion support for versitygw."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "versitygw-cli-fish-completion-1.7.0-1.2.noarch.rpm"
RPM_HASH = "74166fc83176c48ca2d300dabc1b50727dd001198e24723a0364dfb68f1dc0bfd3676158af27c6725199f9888cb96c33e312d2e7b554059aa4f6bd251955992f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "versitygw-cli-fish-completion \
versitygw-fish-completion"

RDEPENDS:${PN} += "fish \
versitygw-cli"

inherit rpm
