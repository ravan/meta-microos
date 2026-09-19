SUMMARY = "The minitar library is a pure-Ruby library that provides the ability"
DESCRIPTION = "The minitar library is a pure-Ruby library that provides the ability to deal \
with POSIX tar(1) archive files. \
This is release 0.9, adding a minor feature to Minitar.unpack and \
Minitar::Input#extract_entry that when <tt>:fsync => false</tt> is provided, \
fsync will be skipped. \
minitar (previously called Archive::Tar::Minitar) is based heavily on code \
originally written by Mauricio Julio Fernández Pradier for the rpa-base \
project."
LICENSE = "Ruby"

PV = "0.9"

RPM_NAME = "ruby4.0-rubygem-minitar-0.9-1.27.aarch64.rpm"
RPM_HASH = "ca7056bb213ac16f39cd169d7f2d7ffca2eca02a4993357514963136e27ffdd1c2bc6b21267cf14810b5a4e3f72920a784fe7dad8c239f8f2ae345cd5db25b8f"

RPROVIDES:${PN} += "ruby4.0-rubygem-minitar \
rubygem-minitar \
rubygem-ruby-4.0.0-minitar \
rubygem-ruby-4.0.0-minitar-0 \
rubygem-ruby-4.0.0-minitar-0.9"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
