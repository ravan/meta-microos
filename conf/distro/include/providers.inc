#
# Prefer MicroOS packages instead of Poky when conflict
#
PREFERRED_RPROVIDER_/usr/bin/awk ?= "gawk"
PREFERRED_RPROVIDER_/usr/bin/cat ?= "coreutils"
PREFERRED_RPROVIDER_/usr/bin/grep ?= "grep"
PREFERRED_RPROVIDER_/usr/bin/mkdir ?= "coreutils"
PREFERRED_RPROVIDER_/usr/bin/mktemp ?= "coreutils"
PREFERRED_RPROVIDER_/usr/bin/mv ?= "coreutils"
PREFERRED_RPROVIDER_/usr/bin/sed ?= "sed"
PREFERRED_RPROVIDER_/usr/bin/touch ?= "coreutils"
PREFERRED_RPROVIDER_dbus-launch ?= "dbus-1-x11"
PREFERRED_RPROVIDER_gdbm ?= "libgdbm6"
PREFERRED_RPROVIDER_gettext ?= "gettext-runtime"
PREFERRED_RPROVIDER_gettext-runtime ?= "gettext-runtime"
PREFERRED_RPROVIDER_gettext-runtime-dev ?= "gettext-runtime"
PREFERRED_RPROVIDER_group-lp ?= "system-group-hardware"
PREFERRED_RPROVIDER_libgpg-error ?= "libgpg-error0"
PREFERRED_RPROVIDER_libksba ?= "libksba8"
PREFERRED_RPROVIDER_libsolv-tools ?= "libsolv-tools"
PREFERRED_RPROVIDER_libxml2 ?= "libxml2-tools"
PREFERRED_RPROVIDER_libz.so.1 ?= "libz1"
PREFERRED_RPROVIDER_ncurses ?= "ncurses"
PREFERRED_RPROVIDER_procps ?= "procps"
PREFERRED_RPROVIDER_python3 ?= "python3"
PREFERRED_RPROVIDER_python3-asyncio ?= "python3"
PREFERRED_RPROVIDER_python3-curses ?= "python3"
PREFERRED_RPROVIDER_python3-sqlite3 ?= "python3"
PREFERRED_RPROVIDER_python3-xml ?= "python3"
PREFERRED_RPROVIDER_readline ?= "libreadline8"
PREFERRED_RPROVIDER_systemd-default-settings-branding ?= "systemd-default-settings-branding-opensuse"
PREFERRED_RPROVIDER_systemd-presets-branding ?= "systemd-presets-branding-microos"
PREFERRED_PROVIDER_zlib ?= "libz1"
PREFERRED_RPROVIDER_zlib ?= "libz1"

#
# Names that several packages in the pool provide, and that a MicroOS image has
# to settle one way or the other. Without a choice here BitBake picks whichever
# recipe it parsed first, which is how an image ends up with systemd-mini in
# place of systemd, or the DVD flavour of the release package.
#
PREFERRED_RPROVIDER_/usr/bin/sh ?= "bash-sh"
PREFERRED_RPROVIDER_dbus-broker-restart-behavior ?= "dbus-broker-block-restart"
PREFERRED_RPROVIDER_distribution-release ?= "microos-release"
PREFERRED_RPROVIDER_libgcc-s.so.1 ?= "libgcc-s1"
PREFERRED_RPROVIDER_libgcc-s1 ?= "libgcc-s1"
PREFERRED_RPROVIDER_libncursesw.so.6 ?= "libncurses6"
PREFERRED_RPROVIDER_libtinfo.so.6 ?= "libncurses6"
PREFERRED_RPROVIDER_libsystemd.so.0 ?= "libsystemd0"
PREFERRED_RPROVIDER_product-flavor-MicroOS ?= "microos-release-appliance"

# Select the MicroOS kernel.  Eventually this needs to be done in
# conf/machine/include/<machine>.inc
PREFERRED_PROVIDER_virtual/kernel ?= "kernel-default"

# pkconfig is defined in Poky, prefer pkgconf wrapper from MicroOS.
# But this can be a mistake, as the -native version should be required
# by libtools, so the strategy should be to reference in the RPM a
# "different" pkgconfig.
#
# Another option can be remove the pkgconfig from RDEPENDS direcly, as
# done in the rpm.bbclass
#
# SKIP_RECIPE[pkgconfig] = "Using MicroOS package"
# PREFERRED_PROVIDER_pkgconfig ?= "pkgconf-pkg-config"
