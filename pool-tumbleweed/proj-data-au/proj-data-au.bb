SUMMARY = "Australia datum grids for Proj"
DESCRIPTION = "Australia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-au-9.8.1-2.3.noarch.rpm"
RPM_HASH = "14506514603ff4a1c45045e76ae778c9213d81f67b2361e3298bf272b634fcc9d8b65f0f5b37e3f5f7036ad471c753694145a474aa91e54deef716cadb8efceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-au"

RDEPENDS:${PN} += ""

inherit rpm
