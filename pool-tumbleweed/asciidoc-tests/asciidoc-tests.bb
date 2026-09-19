SUMMARY = "Functional tests for asciidoc"
DESCRIPTION = "Functional tests for asciidoc that verify the man page generation pipeline works \
correctly on the installed package. \
Run with: /usr/libexec/asciidoc/test-generate-man"
LICENSE = "GPL-2.0-or-later"

PV = "10.2.1"

RPM_NAME = "asciidoc-tests-10.2.1-2.1.noarch.rpm"
RPM_HASH = "f89c09642975f5321b5cad5753f6792c5256d63793ea6cb8bde2b3d93a9d323b7d0a51d3532be46a15d2dd3376a9c54d20f261238ac65a4cbfdf6a2183828ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciidoc-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
asciidoc"

inherit rpm
