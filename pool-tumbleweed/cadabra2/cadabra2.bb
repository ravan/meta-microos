SUMMARY = "A computer algebra system for solving problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. It has extensive \
functionality for tensor computer algebra, tensor polynomial \
simplification including multi-term symmetries, fermions and \
anti-commuting variables, Clifford algebras and Fierz transformations, \
implicit coordinate dependence, multiple index types and many more. \
The input format is a subset of TeX. Both a command-line and a \
graphical interface are available. \
 \
Key features of Cadabra2: \
- Input and output using TeX notation. \
- Designed for field-theory problems, with handling of anti-commuting \
  and non-commuting objects without special notations for their \
  products, gamma matrix algebra, Fierz identities, Dirac conjugation, \
  vielbeine, flat and curved, covariant and contravariant indices, \
  implicit dependence of tensors on coordinates, partial and covariant \
  derivatives... \
- Powerful tensor simplification algorithms, not just for mono-term \
  symmetries but also for multi-terms symmetries like the Bianchi \
  identity, or dimensionally-dependent symmetries like the Schouten \
  identity."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.14"

RPM_NAME = "cadabra2-2.5.14-3.1.aarch64.rpm"
RPM_HASH = "ec1ef34f477b7e77c5b21827fc7e1458189c9f72838cbc59604a6db4a6d8b2e25f6eda3b62df9f59b567773548501ed41565fdbd3744a334b0b618946889204c"

RPROVIDES:${PN} += "cadabra2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglibmm-2.4.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libpython3.13.so.1.0 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
python-abi \
python3 \
typelib-GLib \
typelib-Gdk \
typelib-Gio \
typelib-Gtk"

inherit rpm
