SUMMARY = "Act on upper scopes"
DESCRIPTION = "This module lets you defer actions _at run-time_ that will take place when \
the control flow returns into an upper scope. Currently, you can: \
 \
  * hook an upper scope end with reap ; \
 \
  * localize variables, array/hash values or deletions of elements in higher \
contexts with respectively localize, localize_elem and localize_delete ; \
 \
  * return values immediately to an upper level with unwind, yield and leave ; \
 \
  * gather information about an upper context with want_at and context_info ; \
 \
  * execute a subroutine in the setting of an upper subroutine stack frame with \
uplevel ; \
 \
  * uniquely identify contexts with uid and validate_uid."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-Scope-Upper-0.34-1.20.aarch64.rpm"
RPM_HASH = "8177ca63bd6ad198d8fa61c9410ea151d9d631adebe7749f633f6c50bf538cef3eb87d00e4c1fa23f0a148264c81f3518f34e041169058539c3bbca4d7a23811"

RPROVIDES:${PN} += "perl-Scope--Upper \
perl-Scope-Upper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
