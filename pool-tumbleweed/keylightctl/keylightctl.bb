SUMMARY = "CLI for managing Elgato Keylight (Air)"
DESCRIPTION = "A command line tool for controlling Elgato Key Lights and Key Light Airs."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "keylightctl-0.0.3-2.8.aarch64.rpm"
RPM_HASH = "31a979a7c6815fa922e52f2b5a7206535e48c77d86b13b8e424fe1f5b085446cff2be81d3a76f6e8cad2c937a09a53f84bd64c2ff85b00e050a8e158f311c45b"

RPROVIDES:${PN} += "keylightctl"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
