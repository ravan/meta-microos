SUMMARY = "Common files for Agama server and CLI."
DESCRIPTION = "Files that are needed by the Agama server and the command-line interface, like \
the JSON schemas or the Jsonnet libraries."
LICENSE = "GPL-2.0-only"

PV = "24+0.a836cced5"

RPM_NAME = "agama-common-24+0.a836cced5-54.1.aarch64.rpm"
RPM_HASH = "a836d58bd48923a6e4276f1d626fd3d0ac34610392cd7185ae2c2b474302dbf2849e103248ffa370c97d832502b8248bbd768700cadba6850c35c79ab1c975e1"

RPROVIDES:${PN} += "agama-common"

RDEPENDS:${PN} += ""

inherit rpm
