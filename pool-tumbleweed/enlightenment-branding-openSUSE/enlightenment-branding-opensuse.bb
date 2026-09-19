SUMMARY = "Enlightenment openSUSE branding"
DESCRIPTION = "openSUSE specific files as specific branding."
LICENSE = "GPL-2.0"

PV = "0.2"

RPM_NAME = "enlightenment-branding-openSUSE-0.2-1.13.aarch64.rpm"
RPM_HASH = "8a09af517d7bb6411422f6366fecf75f46733ba30c9bd5779749f8af11b4df2e48edbece9b6ba2cb3ee2e9d84729fda9ef7a177755917d20f9b3e709bfc93747"

RPROVIDES:${PN} += "enlightenment-branding \
enlightenment-branding-openSUSE"

RDEPENDS:${PN} += "enlightenment-profiles-openSUSE \
enlightenment-theme-openSUSE"

inherit rpm
