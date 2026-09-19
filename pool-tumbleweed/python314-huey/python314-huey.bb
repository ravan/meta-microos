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

RPM_NAME = "python314-huey-2.6.0-1.3.noarch.rpm"
RPM_HASH = "2112db511b88744196b2aacf95746774e2a08393d63688c2dba8c2bd7e074f98a80e7b94972c8ab89bc048d18798a7f29e19c8b2391177ae91f00801a9f09a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-huey \
python314-huey \
python3dist-huey"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
