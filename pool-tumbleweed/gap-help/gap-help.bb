SUMMARY = "GAP: Hertweck-Luthar-Passi method"
DESCRIPTION = "HeLP is a package to compute constraints on partial augmentations of \
torsion units in integral group rings using a method developed by \
Luthar, Passi and Hertweck. The package can be employed to verify the \
Zassenhaus Conjecture and the Prime Graph Question for finite groups, \
once characters are known. It uses an interface to the software \
package 4ti2 to solve integral linear inequalities."
LICENSE = "GPL-2.0-only"

PV = "4.1"

RPM_NAME = "gap-help-4.1-1.3.noarch.rpm"
RPM_HASH = "6a776c10074c78381fce002ea8f76130ada49b93a5c953d8a6ef1c5336fd330a407d7331603ba6a792ad40c2488b1297b20e6eff11f993f0af05d1766f9c6077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-help"

RDEPENDS:${PN} += "4ti2 \
gap-4ti2interface \
gap-atlasrep \
gap-core \
gap-ctbllib \
gap-io \
gap-normalizinterface"

inherit rpm
