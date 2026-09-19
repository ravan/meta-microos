SUMMARY = "Command-line wrapper for git and GitHub"
DESCRIPTION = "hub is a command line tool that wraps git in order to extend it with \
extra features and commands that make working with GitHub easier."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "hub-2.14.2-2.16.aarch64.rpm"
RPM_HASH = "44e0d298bf17e4c58bd662928c6f17fa88a8e7513e2b30084459b98588980e601091c0ea5c0d8e57ff75a1b9ecaa36765287ad69fa21fe0c1bf377e39dd47a1c"

RPROVIDES:${PN} += "hub \
rubygem-hub"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
