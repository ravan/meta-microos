SUMMARY = "Action Adventure in Space"
DESCRIPTION = "Rescue! Max is an Action Adventure in Space written in java. \
It is based on an old mac game called Rescue! by Tom Spreen. \
 \
A 2D space real-time, action/strategy game. You are in control of a ship that \
you fly around space fighting enemies and making friends on your way. \
The main objective is to rescue people from planets and take them to star bases."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.5"

RPM_NAME = "rescue-1.0.5-1.11.noarch.rpm"
RPM_HASH = "a7bf662d134cd0a60942c7fc3b040f5c1cd30ef37c90789f2d99bd2e7b8631b1b467b3dbfe5ca574eea4fa8d79a711a387fd1bfb1605439043fdc91f352572b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rescue"

RDEPENDS:${PN} += "/usr/bin/sh \
jre"

inherit rpm
