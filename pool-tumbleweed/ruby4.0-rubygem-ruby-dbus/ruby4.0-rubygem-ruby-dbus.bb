SUMMARY = "Ruby module for interaction with D-Bus"
DESCRIPTION = "Pure Ruby module for interaction with D-Bus IPC system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.25.0"

RPM_NAME = "ruby4.0-rubygem-ruby-dbus-0.25.0-1.7.aarch64.rpm"
RPM_HASH = "0c42fd6ae977ea758a90d16d9b593f6ef4cec0e3433f171524d58b5305c3f56f774d10ed41133b6a3d3db6f477babcded2724c77cde57f5452dcc6d445f21451"

RPROVIDES:${PN} += "ruby-dbus \
ruby4.0-rubygem-ruby-dbus \
rubygem-ruby-4.0.0-ruby-dbus \
rubygem-ruby-4.0.0-ruby-dbus-0 \
rubygem-ruby-4.0.0-ruby-dbus-0.25 \
rubygem-ruby-4.0.0-ruby-dbus-0.25.0 \
rubygem-ruby-dbus"

RDEPENDS:${PN} += "/usr/bin/ruby.ruby4.0 \
ruby-abi \
rubygem-ruby-4.0.0-logger \
rubygem-ruby-4.0.0-rexml"

inherit rpm
