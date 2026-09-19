SUMMARY = "PreScheme compiler"
DESCRIPTION = "Pre-Scheme is a low-level dialect of Scheme, designed for systems programming \
with higher-level abstractions. For example, the Scheme48 virtual machine is \
written in Pre-Scheme. Pre-Scheme is a particularly interesting alternative to \
C for many systems programming tasks, because not only does it operate at about \
the same level as C, but it also may be run in a regular high-level Scheme \
development with no changes to the source, without resorting to low-level stack \
munging with tools such as gdb. Pre-Scheme also supports two extremely \
important high-level abstractions of Scheme: macros and higher-order, anonymous \
functions. Richard Kelsey's Pre-Scheme compiler, based on his PhD research on \
transformational compilation, compiles Pre-Scheme to efficient C, applying \
numerous intermediate source transformations in the process."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "scheme48-prescheme-1.9.3-1.14.aarch64.rpm"
RPM_HASH = "17268b2d7b4ef471be7fc1dc433a4a46c873decaf20ada547c93559431c475ef90344c86ac5f07637034b5bf36319b72ef0d8417ec332b4e257aecea42ed44a6"

RPROVIDES:${PN} += "scheme48-prescheme"

RDEPENDS:${PN} += "/usr/bin/sh \
scheme48"

inherit rpm
