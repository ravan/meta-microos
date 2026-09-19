SUMMARY = "Front-End for nmh Written in tcl/tk"
DESCRIPTION = "Exmh is an X user interface for NMH mail. NMH provides a set of UNIX \
commands that manage folders and mail messages. NMH has many features \
as a result of several years of availability. Exmh provides a graphical \
interface to many of these features, but not everything."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "exmh-2.8.0-3.7.noarch.rpm"
RPM_HASH = "638356b51b59db11ae19a314b9620aecc171e8c59e2ac37e3abca723290d2279f095b39a9e2cd13f97ce2699792a902b41f267b99153e4b74de0f2c8b7dd118c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exmh"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/wish \
expect \
metamail \
nmh"

inherit rpm
