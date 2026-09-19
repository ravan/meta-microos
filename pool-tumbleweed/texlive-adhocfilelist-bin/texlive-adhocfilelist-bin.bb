SUMMARY = "Binary files of adhocfilelist"
DESCRIPTION = "Binary files of adhocfilelist"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn28038"

RPM_NAME = "texlive-adhocfilelist-bin-2026.20260301.svn28038-120.4.aarch64.rpm"
RPM_HASH = "805db39c5c04143d4a8c66ec9238ed49e82253204223052467620ba2af0b6e02eaf0fe443a719d3e416b8cf67b00839764701f3be9233d6b998d61937f0d2970"

RPROVIDES:${PN} += "texlive-adhocfilelist-bin"

RDEPENDS:${PN} += "texlive-adhocfilelist"

inherit rpm
