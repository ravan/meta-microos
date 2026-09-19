SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use dash as /bin/sh implementation."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.5.13.4"

RPM_NAME = "dash-sh-0.5.13.4-1.3.noarch.rpm"
RPM_HASH = "da96fe58383bad6943f7886b7db3f783d11424207392b16500eb2870c4cecace6c31365bbd7f19ad6c4d9d8af60282b53c74ae4d7d19a5659d0fb305a2c8d530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
dash-sh"

RDEPENDS:${PN} += "dash"

inherit rpm
