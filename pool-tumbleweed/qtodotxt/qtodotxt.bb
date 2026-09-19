SUMMARY = "User interface client for todo.txt files"
DESCRIPTION = "QTodoTxt is a graphical interface for the todo.txt format. \
 \
Todo.txt is a TODO list format in which the data is stored in a text \
file. Since todo.txt is both machine and human-readable, tasks can be \
checked out with alternative editors, and be synchronised with cloud \
sync tools such as Nextcloud, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "qtodotxt-1.9.0-3.11.noarch.rpm"
RPM_HASH = "c460434a0f7485db843b540b9cc11b86deec190f8a5609362b41bcf8a870fad5b3009820217845cd986a4e73fa726324ec46515b2e95aa8b9849d5dd89a303b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-qtodotxt \
python3dist-qtodotxt \
qtodotxt"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-dateutil \
python3-qt5"

inherit rpm
