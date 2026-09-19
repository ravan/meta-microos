SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python314-tkreadonly-0.6.1-3.5.noarch.rpm"
RPM_HASH = "65bd7187d329a416a829f1b939789a22732fc60c1b9a2e948bc462288f98d58fdcd01539197b228bbb90d19880c146b2f4c05909f5cf01bdf6526b5626d1a0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tkreadonly \
python314-tkreadonly \
python3dist-tkreadonly"

RDEPENDS:${PN} += "python-abi \
python314-Pygments \
python314-idle \
python314-tk"

inherit rpm
