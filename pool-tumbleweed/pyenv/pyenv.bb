SUMMARY = "Python Version Management"
DESCRIPTION = "pyenv lets the user switch between multiple versions of Python. \
 \
This project was forked from rbenv and ruby-build, and modified for Python."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "pyenv-2.8.4-1.1.aarch64.rpm"
RPM_HASH = "b2891079e25c5404d3be2a3f480b4ccbd5d241f45b5068640f3d615e944f40cb01a376f9f526d8a40dfa8056072f859d3ebffb5a3d4bc72caf3e4c0fe1c0e231"

RPROVIDES:${PN} += "config-pyenv \
pyenv"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
pkgconfig"

inherit rpm
