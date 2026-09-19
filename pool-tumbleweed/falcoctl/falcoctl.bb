SUMMARY = "CLI / Administrative tooling for Falco"
DESCRIPTION = "The official CLI tool for working with \
[Falco](https://github.com/falcosecurity/falco) and its ecosystem components."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "falcoctl-0.13.0-1.4.aarch64.rpm"
RPM_HASH = "a1bac44f791cbb5644f124aaa2972d9226576d72fe4ed79268365c2f2e2f66ed6b3932d4107c795c3ad55d7caa5e0be3857e37b657ec3155f60c86beaf368577"

RPROVIDES:${PN} += "falcoctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
