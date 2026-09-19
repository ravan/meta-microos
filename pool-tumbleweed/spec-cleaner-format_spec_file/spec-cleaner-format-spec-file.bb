SUMMARY = "Binding replacing OBS service format_spec_file"
DESCRIPTION = "Alternative provider of format_spec_file functionality in order to allow \
user to use spec-cleaner rather than to stick to perl based format_spec_file."
LICENSE = "BSD-3-Clause"

PV = "1.2.4+2"

RPM_NAME = "spec-cleaner-format_spec_file-1.2.4+2-1.4.noarch.rpm"
RPM_HASH = "c182e0d2a66dc03ddccbc64ca6b66f0d4c356727f720bae3e5675cf0666e5960b8666bc5af3bf322c40b51bf62f62dc50c5366aafd6c93189d00523f269df5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spec-cleaner-format-spec-file"

RDEPENDS:${PN} += "/usr/bin/sh \
spec-cleaner"

inherit rpm
