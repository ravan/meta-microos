SUMMARY = "A little task queue for Python"
DESCRIPTION = "Huey is a little task queue for Python. \
 \
Huey is: \
 \
 * a task queue \
 * written in python \
 * clean and simple API \
 * redis, sqlite, file-system, or in-memory storage \
 * example code. \
 * read the documentation. \
 \
Huey supports: \
 \
 * multi-process, multi-thread or greenlet task execution models \
 * schedule tasks to execute at a given time, or after a given delay \
 * schedule recurring tasks, like a crontab \
 * automatically retry tasks that fail \
 * task prioritization \
 * task result storage \
 * task expiration \
 * task locking \
 * task pipelines and chains"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python313-huey-2.6.0-1.3.noarch.rpm"
RPM_HASH = "7d5d40703235a83283e32804b075805ec22ca2f9a173bb3c2d15f0a52eb3fd5681320f30bad7a05c032b0d4f5ccb9e5af46f83938002623bbaeaa98c5457d4c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-huey \
python3.13dist-huey \
python313-huey \
python3dist-huey"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
