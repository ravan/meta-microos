SUMMARY = "Test update that requires a session restart"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should inform the user that a session \
restart (re-login) is necessary. This is used, for example, in \
window manager updates."
LICENSE = "GPL-2.0-or-later"

PV = "5.2"

RPM_NAME = "update-test-relogin-suggested-5.2-1.15.aarch64.rpm"
RPM_HASH = "ec3181541202c2eb0765ee4ad62e59c30ddc3859945dc217a3156730c2a88fcf9cd4f50722bf942146de180bf26583c638f555bfa89108a8a8ee6a8338274a8b"

RPROVIDES:${PN} += "update-test-relogin-suggested"

RDEPENDS:${PN} += ""

inherit rpm
