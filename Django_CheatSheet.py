cd /home/frank/eclipse-workspace/BackSnap/ && source env/bin/activate && python3 htdocs/manage.py runserver

virtualenv -p python3 env
source env/bin/activate

django-admin startproject mysite
./manage.py startapp app
./manage.py migrate



{% with ''|center:f.2 as range %}
{% for _ in range %}
&nbsp;&nbsp;&nbsp;&nbsp;
{% endfor %}
{% endwith %}