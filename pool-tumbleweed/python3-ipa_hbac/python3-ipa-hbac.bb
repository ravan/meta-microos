SUMMARY = "Python bindings for the FreeIPA HBAC Evaluator library"
DESCRIPTION = "The python-ipa_hbac package contains the bindings so that libipa_hbac \
can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "python3-ipa_hbac-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "541fede27c958c05ee01d315ddb76d5fb8a07eb16ce769a8f8ccdb9ea21237116e1ab3b01483189c3329e428ad82c8987903d087eb6ce3a7b51095101b391302"

RPROVIDES:${PN} += "python3-ipa-hbac"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libipa-hbac.so.0 \
python-abi \
python3"

inherit rpm
