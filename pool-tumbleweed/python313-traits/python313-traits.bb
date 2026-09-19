SUMMARY = "Explicitly typed attributes for Python"
DESCRIPTION = "The traits package developed by Enthought provides a special type definition \
called a trait. Although they can be used as normal Python object attributes, \
traits also have several additional characteristics: \
 \
 * Initialization: A trait can be assigned a default value. \
 * Validation: A trait attribute's type can be explicitly declared. \
 * Delegation: The value of a trait attribute can be contained either \
   in another object. \
 * Notification: Setting the value of a trait attribute can trigger \
   notification of other parts of the program. \
 * Visualization: User interfaces that permit the interactive \
   modification of a trait's value can be automatically constructed \
   using the trait's definition. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only"

PV = "7.1.0"

RPM_NAME = "python313-traits-7.1.0-1.2.aarch64.rpm"
RPM_HASH = "714bb3bd85bd9e41055f33ba694dfaf5f87544b9bd6ad2e6bb5951cb25a6ae72b70a9f29544a16ce1d245eea035ebbd0a349e044c7e6b902181ad99f99280f92"

RPROVIDES:${PN} += "python3-traits \
python3.13dist-traits \
python313-traits \
python3dist-traits"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
