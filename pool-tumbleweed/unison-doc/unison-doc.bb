SUMMARY = "File synchronization tool"
DESCRIPTION = "Graphical userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0-or-later"

PV = "2.54.0"

RPM_NAME = "unison-doc-2.54.0-1.1.aarch64.rpm"
RPM_HASH = "bde38560e092918157348ef3b0532cf960203ba9bfad91a7e3cb1799b7709242f35cb718dd9cbb6676a53d7c8c39aa83779a117abf35cee79f130b443763604d"

RPROVIDES:${PN} += "unison-doc"

RDEPENDS:${PN} += ""

inherit rpm
