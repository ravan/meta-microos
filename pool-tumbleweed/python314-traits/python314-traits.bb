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

RPM_NAME = "python314-traits-7.1.0-1.2.aarch64.rpm"
RPM_HASH = "3d285993f94720669eac5bd4cf63491f2e279ebd54c3f874ecd3980d98ebd30b2b7ab5fc4c3b455f6528842565641da1b2558bfabf59522444d84047224e520f"

RPROVIDES:${PN} += "python3.14dist-traits \
python314-traits \
python3dist-traits"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
